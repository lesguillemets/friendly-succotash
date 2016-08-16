(ns pl1.core
  (:require [clojure.browser.repl :as repl])
  )

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

; (def cnv (js/fabric.Canvas. "world"))

(defn -main []
  (let [cnv (js/fabric.Canvas. "world")
        rectConfig (clj->js {:left 100
                             :top 100
                             :fill "blue"
                             :width 20
                             :height 20
                             :angle 45 })

        rect (js/fabric.Rect. rectConfig)]
    (do
      (.add cnv rect)
      (.renderAll cnv)
      (.log js/console rectConfig))))

(.addEventListener js/window "load" -main)
