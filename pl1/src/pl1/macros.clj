(ns pl1.macros)

(defmacro consoleLog [x]
  `(.log js/console ~x))
