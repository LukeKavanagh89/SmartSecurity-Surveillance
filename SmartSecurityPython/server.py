from http import server
from urllib import request, response
import grpc
from concurrent import futures
import time

import heating_pb2
import heating_pb2_grpc

class HeatingCall(heating_pb2_grpc.heatingCall):

    def CalledCommand(Request, context, self):
        print("Request has been made to change the input" + request.input)

        response = heating_pb2.Command()
        response.command = ("Command has been changed to " + request.command)
        return response

    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))

    Heating_pb2_grpc.ad_Heating_to_server(
          HeatingCall(), server)

    print('Server has started. Active on port 50054.')
    server.add_insecure_port('[::]:50054')
    server.start()

    try:
    while True:
        time.sleep(86400)
        
     except KeyboardInterrupt:
    server.stop(0)