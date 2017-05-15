<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 




<html>
<head>
<link href="css/StyleSheet.css" rel="stylesheet" type="text/css">

<title>U.S. Presidents</title>
</head>
<body>


		<div>
			<div>
				<h1>Presidents of the United States</h1>
			</div>
		</div>
		<br>
		<div>
			<div></div>
			<div>
				<form action="Presidents.do" method="POST">
					<button type="submit" class="btn btn-default btn-arrow-left"
						name="previous">LAST PRES</button>
				</form>
			</div>
			<div>
				<form action="Presidents.do" method="POST">
					<c:choose>
						<c:when test="${not empty termNumberError}">
							<span class="text-danger"><strong>Invalid term
									number</strong></span>
							<br>
						</c:when>
					</c:choose>
					<label class="standard">Search by Term Number: <input
						class="black" type="text" name="termNumber"> 
						<input type="submit" value="submit" name="getByTermNumber"> 

						<button type="submit" class="btn btn-default"
							name="getByTermNumber">Search</button>
					</label>
				</form>
			</div>
			<div>
				<form action="Presidents.do" method="POST">
					<button type="submit" class="btn btn-default btn-arrow-right"
						name="next">NEXT PRES</button>
				</form>
			</div>
			<div></div>
		</div>
		<div>
			<div></div>
			<div>
				<form class="standard" action="Presidents.do" method="POST">
					<ul>
						<li><span class="info">Name:</span> ${currentPresident.name}</li>
						<li><span class="info">Term Number:</span>
							${currentPresident.termNumber}</li>
						<li><span class="info">Party:</span>
							${currentPresident.party}</li>
						<li><span class="info">Presidency:</span></li>
						<li><span class="info">From:</span>
							${currentPresident.termBeginDate}</li>
						<li><span class="info">To:</span>
							${currentPresident.termEndDate}</li>
						<li><span class="info">Interesting Fact:</span>
							${currentPresident.fact}</li>
					</ul>
				</form>
			</div>
			<div>
				<img src="${currentPresident.picURL}" />
<!-- 				<img src="https://s-media-cache-ak0.pinimg.com/736x/5e/93/d9/5e93d9cf339719dd12aaa5d9a14a41b7.jpg"/> -->
			</div>

			<div></div>
		</div>
</body>
</html>