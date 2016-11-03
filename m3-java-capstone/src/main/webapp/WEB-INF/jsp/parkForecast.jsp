<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">
	<div id="bigDayForecast">
		<h1>Today's Weather</h1>
		<c:set var="bigDay" value="${forecast[0]}"/>
		<c:url var="weatherImgURL" value="/img/weather/${forecast[0].forecastImageName}.png" />
		<img id="bigDayImg" src="${weatherImgURL}" alt="${forecast[0].forecast}" >
		<p id="bigDayHigh"> ${forecast[0].highF} </p>
		<p id="bigDayLow"> ${forecast[0].lowF} </p>
		<p id="bigDayWeather">${forecast[0].forecast}
	</div>
	<c:import url="/WEB-INF/jsp/common/fiveDayForecast.jsp" />
</section>