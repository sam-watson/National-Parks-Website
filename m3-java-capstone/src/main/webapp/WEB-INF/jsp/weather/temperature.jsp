<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<c:choose>
		<c:when test="${preferences.isCelcius()}">
			<p id="fiveDayHigh">High: ${day.highC} Celcius</p>
			<p id="fiveDayLow">Low: ${day.lowC} Celcius</p>
		</c:when>
		<c:otherwise>
			<p id="fiveDayHigh">High: ${day.highF} Fahrenheit</p>
			<p id="fiveDayLow">Low: ${day.lowF} Fahrenheit</p>
		</c:otherwise>
	</c:choose>