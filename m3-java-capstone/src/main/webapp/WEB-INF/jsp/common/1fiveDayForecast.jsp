<section id="fiveDayForecast">
	<c:forEach var="day" items="${forecast}">
		<c:url var="weatherImgURL" value="/img/weather/${day.forecastImageName}.png" />
		<img id="fiveDayImg" src="${weatherImgURL}" alt="${day.forecast}" >
		<p id="fiveDayDay"> ${day.day} </p>
		<p id="fiveDayHigh"> ${day.highF} </p>
		<p id="fiveDayLow"> ${day.lowF} </p>
		<p id="fiveDayWeather">${day.forecast} </p>
	</c:forEach>
</section>