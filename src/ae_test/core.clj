(ns ae-test.core
  (:require [appengine-magic.core :as ae])
  (:use [net.cgrand.moustache :only [app]]))


(defn ae-test-app-handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello, world!!!"})

(def ae-test-app-handler
     (app
      [""]     {:status 200
		:headers {"Content-Type" "text/plain"}
		:body "Hello, world!!!"}
      ["test"] {:status 200
		:headers {"Content-Type" "text/plain"}
		:body "Testing..."}
      [&]      {:status 404
		:body "Page Not Found"}))



(ae/def-appengine-app ae-test-app #'ae-test-app-handler)