<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<section id="fiveDayForecast">
<c:import url="/WEB-INF/jsp/common/tempPrefsButton.jsp"/>
	<div class = fiveDayBlock>
		<c:forEach var="day" items="${forecast}">
			<c:set var="day" value="${day}" scope="request"/>
			<c:import url="/WEB-INF/jsp/weather/oneDayForecast.jsp" />		
		</c:forEach>
	</div>
</section>
