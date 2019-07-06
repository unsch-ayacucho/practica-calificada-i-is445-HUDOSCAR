
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
        
    </head>
    <body>
        <h1>Resultados de los datos</h1>
        
        <ul>
            <li>Docente: <c:out value="${docente}" /></li>
            <li>Semestre academico: <c:out value="${s_academico}"/></li>
            <li>Numero de horas semanales: <c:out value="${horas_semanales}"/></li>
        </ul>
        
        
        
    </body>
</html>
