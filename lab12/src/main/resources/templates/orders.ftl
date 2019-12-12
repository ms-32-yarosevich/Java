<#import "parts/header.ftl" as c>

<@c.page>
<div class="container">
    <div>
        <h2>All Orders</h2>
        <table class="table table-striped">
            <tr>
                <th>Id</th>
                <th>Client</th>
                <th>Address</th>
                <th>Comment</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
             <#list orders as order>
            <tr>
                <td>${order.id}</td>
                <td>${order.client}</td>
                <td>${order.address}</td>
                <td>${order.comment}</td>
                <td><a href="${'/orders/edit/' + order.id}" class="btn btn-outline-secondary">Edit</a></td>
                <td><a href="${'/orders/delete/' + order.id}" class="btn btn-outline-danger">Delete</a></td>
            </tr>
             </#list>
        </table>
    </div>
</div>
</@c.page>