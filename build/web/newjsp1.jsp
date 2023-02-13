<%-- 
    Document   : newjsp1
    Created on : 3 thg 2, 2023, 07:37:26
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <form action="BMIServlet" method="post">
                <table>
                    <tr>
                        <td>
                            <span> Enter Weight(kg): </span>
                            
                        </td>
                        <td>
                            <input type="number" step="any" name="weight" value="${weightt}" placeholder="Enter Weight" required> 
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span> Enter Height(m): </span>
                        </td>
                        <td>
                            <input type="number" step="any" name="height" value="${heightt}" placeholder="Enter Height" required> 
                        </td>
                    </tr>
                     <tr>
                        <td>
                        </td>
                        <td>
                            <input type="submit" value="Calculate"> 
                             <p style="color: red"> ${MESSAGE}</p>
                        </td>
                    </tr>                  
                </table>
            </form>
        </div>
    </body>
</html>
