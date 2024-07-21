(ns clojure-web-api.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.adapter.jetty :as jetty]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/api" [] "Welcome to the API")
  (route/not-found "Not Found"))

(defn -main [& args]
  (jetty/run-jetty app-routes {:port 3000 :join? false}))