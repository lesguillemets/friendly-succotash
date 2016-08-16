(ns pl1.core
  (:require [clojure.browser.repl :as repl]
             [pl1.helper :as h])
  (:require-macros [pl1.macros :as m])
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
                             :height (h/foo 30)
                             :angle 45 })

        rect (js/fabric.Rect. rectConfig)]
    (do
      (aset cnv "selection" false)
      (.add cnv rect)
      (.renderAll cnv)
      (m/consoleLog rectConfig))))

(.addEventListener js/window "load" -main)
