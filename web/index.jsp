<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form action="CamelloController" method="post">
           <input  type="text" placeholder="Digite su palabra" name="txtpalabra"/>
           <input  type="submit"  value="Enviar"/>
        </form>
        
        <% 
        Object obj= request.getSession().getAttribute("palabra");
        if (obj!=null) {
                out.print(obj);
            }
        %>
    </body>
</html>
