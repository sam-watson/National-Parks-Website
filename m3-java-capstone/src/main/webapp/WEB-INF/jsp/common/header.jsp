<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>National Park Geek</title>
    <c:url value="/css/npgeek.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
</head>

<body>
    <header>
    	<div class= "headerImagePlaceholder">
    	</div>
    	<c:url value="/" var="homePageHref" />
    	<c:url value="/img/logo.png" var="logoSrc" />
        <a href="${homePageHref}">
        	<img id="logo" src="${logoSrc}" alt="National Park Geek logo" />
        </a>
        <c:url value="/surveyForm" var="surveyHref" />
        <a id="surveyLink" href="${surveyHref}">
        	Vote for your favorite park!
        </a>
        <div class = "headerGap">
    	</div>
        
    
    </header>
    <%-- <nav>
        <h2>Explore The Solar System</h2>
        <p> Use these state of the art web applications to learn more about the solar system! </p>
        <ul>
        	<c:url value = "/alienAgeInput" var="alienAgeURL" id="alienAgeURL"/>
        	<c:url value = "/alienWeightInput" var="alienWeightURL" />
        	<c:url value = "/alienTravelInput" var="alienTravelURL" />
        	<c:url value = "/spaceForumInput" var="spaceForumInputURL" />
        	<c:url value="/productList" var="productListURL" />
            <li><a href="${alienAgeURL}">Alien Age</a></li>
            <li><a href="${alienWeightURL}">Alien Weight</a></li>
            <li><a href="${alienTravelURL}">Drive Time</a></li>               
            <li><a href="${spaceForumInputURL}">SPaCe Forum</a></li>   
            <li><a href="${productListURL}">SPaCe Store</a></li>         
        </ul>
    </nav> --%>