{
 ;; directory setting
 :public-dir   "public/"
 ;; :tag-out-dir  "tag/"
 :template-dir "template/"
 :layout-dir   "layouts/"

 :url-base     "/"

 :port 8080

 :lang "en"

 :site {:charset    "utf-8"
        :site-title "celestial-ops.com"
        :twitter    "celestialops"
        :project-name "Celestial"
        :root "/"
        }

 ;; post file compile hook
:compile-with-post ["index.html" "community.html" "guides.html" "user_managment.html"]

 :cljs {:src-dir       "cljs"
        :output-to     "js/main.js"
        :optimizations :whitespace
        :pretty-print true}

 :compiler  ["clostache" "cljs"]

 :detailed-log false
 }

