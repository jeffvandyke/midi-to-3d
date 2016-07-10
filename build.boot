(set-env!
  :source-paths #{"src/clj" "src/cljs"}
  :resource-paths #{"resources"}
  ;; boot-cljs-repl wants clojure "1.7.0"
  :dependencies '[[org.clojure/clojure "1.8.0" :scope "provided"]
                  [org.clojure/clojurescript "1.9.76"]
                  [adzerk/boot-cljs "1.7.228-1" :scope "test"]
                  [adzerk/boot-cljs-repl "0.3.0" :scope "test"]
                  [adzerk/boot-reload "0.4.8" :scope "test"]
                  [com.cemerick/piggieback "0.2.1"  :scope "test"]
                  [weasel                  "0.7.0"  :scope "test"]
                  [org.clojure/tools.nrepl "0.2.12" :scope "test"]
                  [pandeiro/boot-http "0.7.3"] ;; latest release
                  ])

(require '[adzerk.boot-cljs :refer :all]
         '[adzerk.boot-cljs-repl :refer :all]
         '[adzerk.boot-reload :refer :all]
         '[pandeiro.boot-http :refer :all])

;; I wonder if I can start my command line programs like fluidsynth from here...

(deftask dev []
 (comp
  (target)
  (serve)
  (watch)
  (reload)
  (cljs-repl)
  (cljs :optimizations :none)))

(deftask fire
 "prints things!"
 []
 (println "things!"))
