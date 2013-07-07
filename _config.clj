{
 :public-dir   "public/"
 ;; :tag-out-dir  "tag/"
 :template-dir "template/"
 :layout-dir   "layouts/"
 :post-dir     "posts/"

 :url-base    "" 

 :port 8080

 :lang "en"

 :site {:charset    "utf-8"
        :site-title "Lambda pod"
        :twitter    "saylambda"
        :project-name "lambda pod"
        }

 :post-filename-regexp #"(\d{4})[-_](\d{1,2})[-_](\d{1,2})[-_](.+)$"
 :post-filename-format "posts/{{year}}-{{month}}/{{filename}}"

 ;; post file compile hook
:compile-with-post ["index.md" "atom.xml" "archive.md"]

 :cljs {:src-dir       "cljs"
        :output-to     "js/main.js"
        :optimizations :whitespace
        :pretty-print true}

 :compiler  ["markdown"]

 :detailed-log true
 }

