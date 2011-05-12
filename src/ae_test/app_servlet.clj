(ns ae-test.app_servlet
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use ae-test.core)
  (:use [appengine-magic.servlet :only [make-servlet-service-method]]))


(defn -service [this request response]
  ((make-servlet-service-method ae-test-app) this request response))
