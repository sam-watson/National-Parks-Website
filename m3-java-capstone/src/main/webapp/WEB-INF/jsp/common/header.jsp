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
        <div class = "headerGap">
    	</div>
        
        <div class= "allHeaderText">
        	<h1>The United States of America National Park System</h1>
        	<p>The United States National Park System was founded over 4.6 billion years ago when the gravitational collapse of a giant inter-stellar molecular cloud spontaneously created an office building and shot it off into space where it traveled 14.8 light years before landing at its current location - 1849 C Street NW, in Washington D.C. USA. The vast majority of the system's parks were build and maintained by dinosaurs over 100 million years ago before the properties were turned over to the United States Government in 1487 Treaty of Shrevport. Today, the United States maintains just over 9 parks nationwide, where visitors are encouraged to view nature and buy commemorative bottles of water for only $6. Please select from the parks below to get more information about each park and to find out about travel and dining options. From all of us at the USANPS: WELCOME and please enjoy YOUR National Parks!
    	</div>
    	
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