
(set-env!
 :resource-paths #{"resources"}
 :source-paths   #{"src"}
 :dependencies   '[[org.clojure/clojure "1.9.0-alpha17"  :scope "provided"]
                   [org.clojure/core.async "0.3.443"     :scope "provided"]
                   [com.datomic/datomic-pro "0.9.5561"
                    :scope "provided"
                    :exclusions [org.clojure/clojure]]
                   [com.datomic/clj-client "0.8.606"
                    :scope "provided"
                    :exclusions [org.clojure/*]]

                   [adzerk/boot-test "RELEASE" :scope "test"]
                   [adzerk/bootlaces "0.1.13"  :scope "test"]])


(require '[adzerk.boot-test :refer (test)]
         '[adzerk.bootlaces :refer :all])

(def project 'datomic.schema)
(def +version+ "0.1.11")

(bootlaces! +version+)


(task-options!
 pom {:project     project
      :version     +version+
      :description "A DSL for Datomic Schema Definitions"
      :url         "https://github.com/gfZeng/datomic.schema"
      :scm         {:url "https://github.com/yourname/datomic.schema"}
      :license     {"Eclipse Public License"
                    "http://www.eclipse.org/legal/epl-v10.html"}})

(require '[adzerk.boot-test :refer [test]])
