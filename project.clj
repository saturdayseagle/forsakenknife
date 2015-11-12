(defproject saturdayseagle/forsakenknife "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [
  		["net", {:url "https://raw.githubusercontent.com/easterntombstone/loneviper/master"}]
  ]
  :dependencies [[org.clojure/clojure "1.7.0"] [easterntombstone/forsakenknife "0.2.0-SNAPSHOT"]]
  :main ^:skip-aot forsakenknife.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
