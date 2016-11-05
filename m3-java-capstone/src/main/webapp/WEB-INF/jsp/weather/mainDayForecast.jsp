<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<div class="todaysForecastPicture">
		<c:set var="day" value="${day}"/>
		<c:url var="weatherImgURL" value="/img/weather/${day.forecastImageName}.png" />
		<img id="bigDayImg" src="${weatherImgURL}" alt="${day.forecast}" >
	</div>
	
	<div class="todaysForecastWords">
		<h2>Today's Weather</h2>
		<p id="bigDayWeather">Forecast: ${day.forecast}
		<c:set var="day" value="${day}" scope="request"/>
		<c:import url="/WEB-INF/jsp/weather/temperature.jsp" />	
		<p id="advice">${day.getAdvice()} </p>
	</div>