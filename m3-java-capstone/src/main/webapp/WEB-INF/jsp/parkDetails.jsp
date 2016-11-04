<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />



<section id="main-content">
	<section class="parkDetails">
	
		<div class= "parkDetailsImage">
<%-- 	<c:url var="parkDetailsURL" value="/parkForecast?code=${park.parkCode}" /> --%>
<%-- 	<a class="parkLink" href="${parkDetailsURL}" > --%>
				<c:url var="parkImgSrc" value="/img/parks/${fn:toLowerCase(park.parkCode)}.jpg" />
				<img id="parkImg" src="${parkImgSrc}" alt="${park.parkName}" >
<!-- 			</a> -->
		</div>
		
		<div class="parkFactsList">
		<p id="parkName">Name: ${park.parkName}</p>
		<p id="state">Location: ${park.state}</p>
		<p id="acreage">Size: ${park.acreage} acres</p>
		<p id="elevation">Max Elevation: ${park.elevationInFeet} feet</p>
		<p id="milesoftrail">Hiking Trails: ${park.milesOfTrail} miles</p>
		<p id="campsites">Camp sites: ${park.numberOfCampsites}</p>
		<p id="climate">Climate: ${park.climate}</p>
		<p id="yearfounded">Year Founded: ${park.yearFounded}</p>
		<p id="annualvisitors">Annual Visitors: ${park.annualVisitorCount}</p>
		<p id="entryfee">Entry Fee: \$ ${park.entryFee}.00</p>
		<p id="numberofanimalspecies">Species of Animals: ${park.numberOfAnimalSpecies}</p>
		</div>
		
		<div class="5-dayForecast">
			<c:import url="/WEB-INF/jsp/common/fiveDayForecast.jsp" />
		</div>
			
		<div class="quote">
		<h2 id="inspirationalquote">"${park.inspirationalquote}"</h2>
		<p id="inspirationalquotesource"> - ${park.inspirationalQuoteSource}</p>
		</div>
	
	</section>
	
	<section>
	<div id="todaysForecast">
		<div class="todaysForecastPicture">
		<c:set var="bigDay" value="${forecast[0]}"/>
		<c:url var="weatherImgURL" value="/img/weather/${forecast[0].forecastImageName}.png" />
		<img id="bigDayImg" src="${weatherImgURL}" alt="${forecast[0].forecast}" >
		</div>
		
		<div class="todaysForecastWords">
		<h2>Today's Weather</h2>
		<p id="bigDayWeather">Forecast: ${forecast[0].forecast}
		<p id="bigDayHigh"> High: ${forecast[0].highF} </p>
		<p id="bigDayLow"> Low: ${forecast[0].lowF} </p>
		<p id="advice">${forecast[0].getAdvice()} </p>
		</div>
	
	</div>
	</section>
</section>