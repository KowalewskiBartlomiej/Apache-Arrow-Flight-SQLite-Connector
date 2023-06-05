FROM ibmcom/websphere-liberty:kernel-java11-openj9-ubi
MAINTAINER IBM
LABEL name="wdp-connect-sdk-gen-flight" Vendor="IBM" Version=unspecified release="1.0" summary=" " description="This image runs wdp-connect-sdk-gen-flight service"
USER 1000321001
COPY --chown=1000321001:1000321001 root/wlp/usr/servers/defaultServer /config/
#Use line below to inject public keys for client authentication
#COPY --chown=1000321001:1000321001 root/etc /config/etc/
COPY --chown=1000321001:1000321001 root/initscripts /opt/ibm/initScripts/
RUN echo app - wdp-connect-sdk-gen-flight: unspecified built on Mon Jun 05 18:55:14 CEST 2023 >> /opt/ibm/initScripts/version.txt
USER root
RUN chmod a+rxw /config /config/apps /logs
RUN chmod a+rwx /opt/ibm/initScripts/*.*
USER 1000321001
RUN for i in `cat /config/server.env`; do export $i; done; \
    echo "KEYSTORE_PASSWORD=$keystore_password" > /config/bootstrap.properties; \
    echo "TRUSTSTORE_PASSWORD=changeit" >> /config/bootstrap.properties; \
    installUtility install --acceptLicense defaultServer; \
    securityUtility createSSLCertificate --password=$keystore_password --server=defaultServer
USER root
RUN chmod -R a+rwx /opt/ibm/wlp/output
USER 1000321001
