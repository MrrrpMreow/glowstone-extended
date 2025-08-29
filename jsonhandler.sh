#!/bin/bash
echo Usage: jsonhandler.sh blockname \(optional blockpath ending in /\)

printf "{\n  \"variants\": {\n    \"\": { \"model\": \"glowstone-extended:block/$2$1\" }\n  }\n}" > ./src/main/resources/assets/glowstone-extended/blockstates/$1.json
printf "{\n  \"parent\": \"block/cube_all\",\n  \"textures\": {\n    \"all\": \"glowstone-extended:block/$2$1\"\n  }\n}" > ./src/main/resources/assets/glowstone-extended/models/block/$2$1.json
printf "{\n  \"parent\": \"glowstone-extended:block/$2$1\"\n}" > ./src/main/resources/assets/glowstone-extended/models/item/$1.json
