(defproject vimcljsrepl "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.5.0"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.228" :scope "provided"]
                 [compojure "1.4.0"]
                 [ring/ring-defaults "0.1.5"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [ring/ring-devel "1.4.0"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler vimcljsrepl.handler/app}
  :source-paths ["src/clj" "src/cljs"]
  :profiles
  {:dev {:repl-options {:init-ns vimcljsrepl.handler
                        :nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
         :dependencies [[weasel "0.7.0"]
                        [org.clojure/tools.nrepl "0.2.10"]
                        [com.cemerick/piggieback "0.2.1"]]}})
