import grpc
import genericpath

import Heating_pb2
import Heating_pb2_grpc

channel = grpc.insecure_channel('localhost:50054')

stub = Heating_pb2.HeatingStub(channel)

command = Heating_pb2.Command(command="Turn on the heating for the house")

response = stub.CalledCommand(command)

print(response.command)