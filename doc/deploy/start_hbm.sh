#!/bin/bash
echo "publish----------"

# shellcheck disable=SC2006
# shellcheck disable=SC2009
process_id=`ps -ef | grep HumanBeingModels.jar | grep -v grep |awk '{print $2}'`
if [ "$process_id" ] ; then
sudo kill -9 "$process_id"
fi

source /etc/profile
# shellcheck disable=SC2164
cd /root/humanbeingmodels/0.0.2
# !IMPORTANT set the limit of memory use
nohup java -Xmx1024M -Xms512M -jar -Dspring.profiles.active=prod HumanBeingModels.jar >/root/hbm.0.0.2.log &
tail -f /root/hbm.0.0.2.log

echo "end publish"
