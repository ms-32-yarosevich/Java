<#import "parts/header.ftl" as c>

<@c.page>
<div class="container">
    <h2>Edit Employee Details</h2>
    <div>
        <form class="form-horizontal" action="/orders" method="post">
            <div class="form-group">
            </div>
            <div class="form-group">
                <div class="col-sm-10">
                    <input type="hidden" name="id" value="${order.id}">
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-10">Client:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="client" value="${order.client}">
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-10">Address:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="address" value="${order.address}">
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-10">Comment:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="comment" value="${order.comment}">
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-2">
                    <button type="submit" class="btn btn-primary">Edit</button>
                </div>
            </div>
        </form>
    </div>
</div>
</@c.page>