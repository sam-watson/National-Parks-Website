<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<form action="surveyForm" method="POST">
	<div class="formGroup">		
		<label for="favoritePark">Which park is YOUR favorite???</label>
		<select name="favoritePark" id="favoritePark">
			<option value="CVNP">Cuyahoga Valley National Park</option>
			<option value="ENP">Everglades National Park</option>
			<option value="GCNP">Grand Canyon National Park</option>
			<option value="GNP">Glacier National Park</option>
			<option value="GSMNP">Great Smoky Mountains National Park</option>
			<option value="GTNP">Grand Teton National Park</option>
			<option value="MRNP">Mount Rainier National Park</option>
			<option value="RMNP">Rocky Mountain National Park</option>
			<option value="YNP">Yellowstone National Park</option>
			<option value="YNP2">Yosemite National Park</option>
		</select>
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
