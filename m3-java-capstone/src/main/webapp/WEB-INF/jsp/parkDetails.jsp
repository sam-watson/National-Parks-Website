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
			
		<div class="quote">
		<h2 id="inspirationalquote">"${park.inspirationalquote}"</h2>
		<p id="inspirationalquotesource"> - ${park.inspirationalQuoteSource}</p>
		</div>
	
	</section>
	
	<section id="weather">
		<c:import url="/WEB-INF/jsp/weather/tempPrefsButton.jsp"/>
		<div id="todaysForecast">
			<c:set var="day" value="${forecast[0]}" scope="request"/>
			<c:import url="/WEB-INF/jsp/weather/mainDayForecast.jsp" />
		</div>
		<div class="5-dayForecast">
			<div class = fiveDayBlock>
				<c:forEach var="day" items="${forecast}">
					<c:set var="day" value="${day}" scope="request"/>
					<c:import url="/WEB-INF/jsp/weather/oneDayForecast.jsp" />		
				</c:forEach>
			</div>
		</div>
	</section>
</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />
