<html lang="en-US">
<head>
    <meta charset="UTF-8">
    <title>Forms</title>
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

                    <table class="table ">
                        <thead class="thead-default">
                            <tr>
                                <th scope="col">№</th>
                                <th scope="col">Form name</th>
                            </tr>
                        </thead>
                        <tbody>
                            <#list customforms as customform>
                                <tr>
                                    <td scope="row">${customform.id}</td>
                                    <td scope="row">${customform.formName}</td>
                                    <td><a href="/form-info?id=${customform.id}" class="btn btn-primary">Answer questions</a></td>
                                    <td><a href="/delete-form?id=${customform.id}" class="btn btn-primary">Delete form</a></td>
                                </tr>
                            </#list>
                        </tbody>
                    </table>
                </div>
            <div class="row">

            </div>
        </div>

        <div class="col-6 col-md-3 sidebar-offcanvas" id="sidebar">
            <div class="list-group">
                <a href="/forms" class="list-group-item ">View forms</a>
                <a href="/create-form" class="list-group-item">Create new form</a>
            </div>
        </div>
    </div>

</main>

</body>
</html>