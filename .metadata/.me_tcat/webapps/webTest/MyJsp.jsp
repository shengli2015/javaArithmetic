<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title></title>
  </head>
  
  <body>
	<p><%= new java.util.Date() %> </p>
	<p><%= request.getRemoteHost() %> </p>
	<p><%= session.getId() %> </p>
	<p><%= request.getParameter("p") %> </p>
  </body>
</html>
