package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }
  
  public static Result category() {
    return ok(category.render("Delete Data."));
  }
  
  public static Result product() {
    return ok(product.render("Product"));
  }
  
  public static Result howtopay() {
    return ok(howtopay.render("Your new application is ready."));
  }
  
  public static Result howtoshipping() {
    return ok(howtoshipping.render("Your new application is ready."));
  }
      
  public static Result view() {
    return ok(index.render("Your new application is ready."));
  }
  
  public static Result about() {
    return ok(about.render("About Me."));
  }
  
  public static Result board() {
    return ok(board.render("Webboard"));
  }
}