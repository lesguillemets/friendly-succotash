(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'pl1.core
   :output-to "out/pl1.js"
   :output-dir "out"})
