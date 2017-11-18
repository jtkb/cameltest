# cameltest

CamelTest is an example of how APIs can be created in seperate OSGi bundles but share the same parent-path yet be deployed individually into an OSGi container.

There is no final 'WAR' file created containing all JARs and dependencies. Dependencies sill have to be specified but many of them can be deployed using Karaf 'features'. The next step is to create a 'features' container e.g. KAR file, that will contain all the depencency bundles/features ready for the actual code to be dropped into.
