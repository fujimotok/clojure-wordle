(defproject clojure-wordle "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [ring "1.9.5"]
                 [compojure "1.7.0"]]
  :plugins [[lein-ring "0.12.6"]]
  :main ^:skip-aot clojure-wordle.core
  :ring {:handler clojure-wordle.ring-test/handler}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
