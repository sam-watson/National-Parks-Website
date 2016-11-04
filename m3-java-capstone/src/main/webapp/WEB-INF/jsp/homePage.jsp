<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<div class= "allHeaderText">
        	<h1>The United States of America National Park System</h1>
        	<p>The United States National Park System was founded over 4.6 billion years ago when the gravitational collapse of a giant inter-stellar molecular cloud spontaneously created an office building and shot it off into space where it traveled 14.8 light years before landing at its current location - 1849 C Street NW, in Washington D.C. USA. The vast majority of the system's parks were build and maintained by dinosaurs over 100 million years ago before the properties were turned over to the United States Government in 1487 Treaty of Shrevport. Today, the United States maintains just over 9 parks nationwide, where visitors are encouraged to view nature and buy commemorative bottles of water for only $6. Please select from the parks below to get more information about each park and to find out about travel and dining options. From all of us at the USANPS: WELCOME and please enjoy YOUR National Parks!
    	</div>
    	
    	<div class = "headerGap">
    	</div>

<section id="main-content">
	<div class="container">
	<c:forEach items="${parkList}" var="park">
		<section class="parkListItem">
			<c:url var="parkDetailsURL" value="/parkDetails?code=${park.parkCode}" />
			<a class="parkLink" href="${parkDetailsURL}" >
				<c:url var="parkImgSrc" value="/img/parks/${fn:toLowerCase(park.parkCode)}.jpg" />
				<img id="parkImg" src="${parkImgSrc}" alt="${park.parkName}" >
			</a>
				<h4 id="parkName">${park.parkName}</h4>
				<h5 id="state">${park.state}</h5>
				<p id="description">${park.parkDescription}</p>
		</section>
	</c:forEach>
	<h3>
		
	</h3>
	</div>
</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />
