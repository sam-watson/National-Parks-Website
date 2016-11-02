<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">
	<c:forEach items="${parkList}" var="park">
		<section class="parkListItem">
			<c:url var="parkDetailsURL" value="/parkDetail?code=${park.parkCode}" />
			<a class="parkLink" href="${parkDetailsURL}" >
				<c:url var="parkImgSrc" value="/img/parks/${fn:toLowerCase(park.parkCode)}.jpg" />
				<img id="parkImg" src="${parkImgSrc}" alt="${park.parkName}" >
			</a>
				<p id="parkName">${park.parkName}</p>
				<p id="state">${park.state}</p>
				<p id="description">${park.parkDescription}</p>
			
		</section>
	</c:forEach>
</section>