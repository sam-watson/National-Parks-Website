<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

		<div class = "singleDay">
		<c:url var="weatherImgURL" value="/img/weather/${day.forecastImageName}.png" />
		<img id="fiveDayImg" src="${weatherImgURL}" alt="${day.forecast}" >
		<h5 id="fiveDayDay"> ${day.day} </h5>
		<p id="fiveDayWeather">${day.forecast} </p>
		<c:set var="day" value="${day}" scope="request"/>
		<c:import url="/WEB-INF/jsp/weather/temperature.jsp" />	
		</div>
