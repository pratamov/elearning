FROM jboss/wildfly:latest

ENV USERNAME admin
ENV PASSWORD admin
ENV PORT_OFFSET 0

RUN mkdir /opt/jboss/wildfly/themes
RUN /opt/jboss/wildfly/bin/add-user.sh $USERNAME $PASSWORD --silent

CMD /opt/jboss/wildfly/bin/standalone.sh -b=0.0.0.0 -bmanagement=0.0.0.0 -Djboss.socket.binding.port-offset=$PORT_OFFSET -c=standalone.xml