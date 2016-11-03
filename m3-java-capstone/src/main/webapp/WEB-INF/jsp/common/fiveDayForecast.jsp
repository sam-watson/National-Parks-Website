<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<section id="fiveDayForecast">
	<c:url var="formAction" value="/parkForecast" />
	<input type="hidden" name="code" value="${forecast[0].parkCode}">
	<form method="post" action="${formAction}" class="inline">
  		<button type="submit" name="celcius" value="${!preferences.celcius}" class="link-button">
    		<c:choose>
    			<c:when test="${preferences.celcius}">
    				Farhenheit
    			</c:when>
    			<c:otherwise>
    				Celcius
    			</c:otherwise>
    		</c:choose>
  		</button>
	</form>
	<c:forEach var="day" items="${forecast}">
		<c:url var="weatherImgURL" value="/img/weather/${day.forecastImageName}.png" />
		<img id="fiveDayImg" src="${weatherImgURL}" alt="${day.forecast}" >
		<p id="fiveDayDay"> ${day.day} </p>
		<c:choose>
			<c:when test="${preferences.celsius}">
				<p id="fiveDayHigh"> ${day.highC} Celcius</p>
				<p id="fiveDayLow"> ${day.lowC} Celcius</p>
			</c:when>
			<c:otherwise>
				<p id="fiveDayHigh"> ${day.highF} Fahrenheit</p>
				<p id="fiveDayLow"> ${day.lowF} Fahrenheit</p>
			</c:otherwise>
		</c:choose>
		<p id="fiveDayWeather">${day.forecast} </p>
	</c:forEach>
</section>