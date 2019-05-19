(defproject clojure-game-geek "0.1.0-SNAPSHOT"
  :description "A tiny BoardGameGeek clone written in Clojure with Lacinia"
  :url "https://github.com/walmartlabs/clojure-game-geek"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.walmartlabs/lacinia "0.21.0"]]
  :repl-options {:init-ns clojure-game-geek.core})
