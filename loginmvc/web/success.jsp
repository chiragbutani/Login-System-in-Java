

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
    String username = (String) session.getAttribute("UserName");
    if (username == null) {
        out.print("session not here!!!!");
    } else 
    {
    

%>

<html>
    
    <head>
        <script>
        (function() {
        var cx = '017643444788069204610:4gvhea_mvga'; // Insert your own Custom Search engine ID here
        var gcse = document.createElement('script'); gcse.type = 'text/javascript'; gcse.async = true;
        gcse.src = (document.location.protocol == 'https' ? 'https:' : 'http:') +
        '//www.google.com/cse/cse.js?cx=' + cx;
        var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(gcse, s);
        })();
            </script>
    </head>
    
    <body>
        
        <gcse:search></gcse:search>
        <center>
        <a href="Logout">Logout</a>
        </center>
    </body>
</html>

<%}%>


