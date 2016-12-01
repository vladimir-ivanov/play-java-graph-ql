package controllers;

import play.mvc.Result;
import services.MyGraphQL;

import static play.mvc.Results.ok;

public class ApiController {
    public Result index() {
        return ok(MyGraphQL.getModel());
    }
}
