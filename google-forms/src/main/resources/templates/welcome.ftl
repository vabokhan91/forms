<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">

    <title>Welcome!!!</title>
    <#include "scripts.ftl"/>
</head>

<body>

<#include "header.ftl"/>

<main role="main" class="container">

    <div class="row row-offcanvas row-offcanvas-right" style="margin-top: 80px">

        <div class="col-12 col-md-9">
            <p class="float-right d-md-none">
                <button type="button" class="btn btn-primary btn-sm" data-toggle="offcanvas">Toggle nav</button>
            </p>
            <div class="jumbotron">
                <h1>Hello, user!</h1>
                <p>This popular and innovative application allows you to create various types of forms. So, do not hesitate and click
                on 'Create form' to create new form and 'View forms' to browse through already made forms!!!</p>
            </div>
            <div class="row">

            </div>
        </div>

        <div class="col-6 col-md-3 sidebar-offcanvas" id="sidebar">
            <div class="list-group">
                <a href="/forms" class="list-group-item">View forms</a>
                <a href="/create-form" class="list-group-item">Create new form</a>

            </div>
        </div>
    </div>

</main>

</body>
</html>
