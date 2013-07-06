(defproject celestial-ops.com "0.0.1"
  :description "lambda pod website"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [misaki "0.2.6.2-beta"]
                 [narkisr/misaki-markdown "0.0.1-beta"]]

  
  :aliases        {"all" ["with-profile" "dev"]}

  :repositories [["sonatype-snapshots" "https://oss.sonatype.org/content/repositories/snapshots/"]]

 
  :main misaki.server)
