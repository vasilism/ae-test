(ns ae-test.core
  (:require [appengine-magic.core :as ae]))


(defn ae-test-app-handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello, world!!!"})


(ae/def-appengine-app ae-test-app #'ae-test-app-handler)