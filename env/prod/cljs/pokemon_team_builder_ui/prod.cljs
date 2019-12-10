(ns pokemon-team-builder-ui.prod
  (:require
    [pokemon-team-builder-ui.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
