<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<section id="fiveDayForecast">
	<c:url var="formAction" value="/parkForecast" />
	
	<form method="post" action="${formAction}" class="inline">
	<input type="hidden" name="code" value="${park.parkCode}">
  		<button type="submit" name="celcius" value="${!preferences.isCelcius()}" class="link-button">
  			View in 
    		<c:choose>
    			<c:when test="${preferences.isCelcius()}">
    				Fahrenheit
    			</c:when>
    			<c:otherwise>
    				Celcius
    			</c:otherwise>
    		</c:choose>
  		</button>
	</form>
	
	<div class = fiveDayBlock>
	<c:forEach var="day" items="${forecast}">
		<div class = "singleDay">
		<c:url var="weatherImgURL" value="/img/weather/${day.forecastImageName}.png" />
		<img id="fiveDayImg" src="${weatherImgURL}" alt="${day.forecast}" >
		<h5 id="fiveDayDay"> ${day.day} </h5>
		<p id="fiveDayWeather">${day.forecast} </p>
		<c:choose>
			<c:when test="${preferences.isCelcius()}">
				<p id="fiveDayHigh">High: ${day.highC} Celcius</p>
				<p id="fiveDayLow">Low: ${day.lowC} Celcius</p>
			</c:when>
			<c:otherwise>
				<p id="fiveDayHigh">High: ${day.highF} Fahrenheit</p>
				<p id="fiveDayLow">Low: ${day.lowF} Fahrenheit</p>
			</c:otherwise>
		</c:choose>
		</div>
	</c:forEach>
	</div>
</section>
