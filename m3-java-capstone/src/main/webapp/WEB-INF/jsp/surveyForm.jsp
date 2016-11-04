<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<form action="surveyForm" method="POST">
	<div class="formGroup">		
		<label for="favoritePark">Which park is YOUR favorite???</label>
		<input type="text" name="language" id="language" />
	</div>
	<div class="formGroup">
		<label for="email">Give us your email:</label>
		<input type="email" name="email" id="email" />
	</div>
	<div class="formGroup">
		<label for="state">What is your state of residence?: </label>
		<input type="text" name="state" id="state" />
	</div>	
	<div class="formGroup">		
		<label for="activity">How active are you?: </label>
		<select name="activity" id="activity">
			<option value="inactive">Inactive</option>
			<option value="sedentary">Sedentary</option>
			<option value="active">Active</option>
			<option value="extreme">EXTREME</option>
		</select>
	</div>
	<div class="formGroup">
		<input type="submit" value="VOTE!" />
	</div>		
</form>
