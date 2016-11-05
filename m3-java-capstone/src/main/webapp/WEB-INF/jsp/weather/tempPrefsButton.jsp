<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="tempButton">
	<c:url var="formAction" value="/parkForecast" />
	<form method="post" action="${formAction}" class="inline">
	<input type="hidden" name="code" value="${park.parkCode}">
  		<button type="submit" name="celcius" value="${!preferences.isCelcius()}" class="link-button">
  			View in 
    		<c:choose>
    			<c:when test="${preferences.isCelcius()}">
    				Fahrenheit
    			</c:when>
    			<c:otherwise>
    				Celcius
    			</c:otherwise>
    		</c:choose>
  		</button>
	</form>
</div>