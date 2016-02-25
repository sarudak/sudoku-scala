(ns sudoku-ui.core
  (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(println "Edits to this text should show up in your developer console.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:board 
[[0,0,6,0,0,7,3,0,0],
 [0,1,8,0,0,9,0,5,0],
 [5,0,0,0,0,0,0,6,4],
 [9,2,0,0,8,0,0,0,0],
 [0,0,0,7,6,3,0,0,0],
 [0,0,0,0,9,0,0,7,5],
 [6,3,0,0,0,0,0,0,8],
 [0,9,0,3,0,0,5,2,0],
 [0,0,2,4,0,0,6,0,0]] }))

(defn render-cell [row-num col-num val]
  [:div {:style {:width 40 :height 40 :float "left" :font-size "20pt"}} (str val)])

(defn render-row [row-num row]
  (map (partial render-cell row-num 1)
   row))

(defn render-board [board]
  (map-indexed render-row 
               board))

(defn hello-world []
  [:div 
   [:h1 "Let's play sudoku!"]
   [:div {:style {:width 360 :height 360}}
    
    (render-board (:board @app-state))
    ]
  ])

(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))


(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
