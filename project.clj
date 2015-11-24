(defproject digitalbird.saturdayseagle/forsakenknife "0.2.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "GNU GPL 3" :url "http://www.gnu.org/licenses/gpl-3.0.en.html"}
  :repositories [
		["github" "https://raw.githubusercontent.com/easterntombstone/loneviper/master"]
;  		["local" "file://loneviper"]
  ]
  :dependencies [[org.clojure/clojure "1.7.0"] [digitalbird.easterntombstone/forsakenknife "0.3.0-SNAPSHOT"]]
  :plugins [[lein-ancient "0.6.8" :exclusions [org.clojure/clojure]] [lein-kibit "0.1.2"] [jonase/eastwood "0.2.1"] [lein-bikeshed "0.2.0"] [lein-cloverage "1.0.6"]]
  :main ^:skip-aot forsakenknife.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :aliases {"omni" ["do" ["clean"] ["test"] ["with-profile" "production" "deps" ":tree"] ["ancient"] ["kibit"] ["bikeshed" "-m" "1000"] ["cloverage"] ["deploy" "local"]]}
)
